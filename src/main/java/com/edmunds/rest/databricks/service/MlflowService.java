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

import java.io.IOException;

/**
 * A wrapper around the Databricks Job API.
 * @see <a href="https://docs.databricks.com/api/latest/jobs.html">https://docs.databricks.com/api/latest/jobs.html</a>
 */
public interface MlflowService {
    RegisteredModelDTO[] searchRegisteredModels(String filter, int maxResults, String orderBy) throws IOException, DatabricksRestException;
}
