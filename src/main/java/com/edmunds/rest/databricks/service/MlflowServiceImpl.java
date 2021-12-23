/*
 * Copyright 2018 Edmunds.com, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.edmunds.rest.databricks.service;

import com.edmunds.rest.databricks.DTO.mlflow.RegisteredModelDTO;
import com.edmunds.rest.databricks.DatabricksRestException;
import com.edmunds.rest.databricks.RequestMethod;
import com.edmunds.rest.databricks.restclient.DatabricksRestClient;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Implementation of MlflowService.
 */
public class MlflowServiceImpl extends DatabricksService implements MlflowService {

    private static Logger log = Logger.getLogger(MlflowServiceImpl.class.getName());

    public MlflowServiceImpl(final DatabricksRestClient client) {
        super(client);
    }

    @Override
    public RegisteredModelDTO[] searchRegisteredModels(String filter, int maxResults, String orderBy)
            throws IOException, DatabricksRestException {
        Map<String, Object> data = new HashMap<>();
        data.put("filter", filter);
        data.put("max_results", maxResults);
        data.put("order_by", orderBy);
        byte[] response = client
                .performQuery(RequestMethod.GET, "/mlflow/registered-models/search", data);
        Map<String, RegisteredModelDTO[]> jsonObject = this.mapper.readValue(response, new
                TypeReference<Map<String, RegisteredModelDTO[]>>() {
                });
        return jsonObject.get("registered_models");
    }
}
