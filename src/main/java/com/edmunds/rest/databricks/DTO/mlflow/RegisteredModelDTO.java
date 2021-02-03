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

package com.edmunds.rest.databricks.DTO.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RegisteredModelDTO {
    @JsonProperty("name")
    private String name;
    @JsonProperty("creation_timestamp")
    private Long creationTimestamp;
    @JsonProperty("last_updated_timestamp")
    private Long lastUpdatedTimestamp;
    @JsonProperty("latest_versions")
    private List<ModelVersionDTO> latestVersions;
    @JsonProperty("tags")
    private List<ModelTagDTO> tags;
}
