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

package com.edmunds.rest.databricks.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 */
public class ClusterLibraryStatusesDTO implements Serializable {

  @JsonProperty("cluster_id")
  private String clusterId;
  @JsonProperty("library_statuses")
  private LibraryFullStatusDTO[] libraryFullStatuses;

  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public LibraryFullStatusDTO[] getLibraryFullStatuses() {
    return libraryFullStatuses;
  }

  public void setLibraryFullStatuses(LibraryFullStatusDTO[] libraryFullStatuses) {
    this.libraryFullStatuses = libraryFullStatuses;
  }
}