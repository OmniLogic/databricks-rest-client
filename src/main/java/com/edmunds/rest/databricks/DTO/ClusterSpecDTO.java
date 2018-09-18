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
@SuppressWarnings("PMD")
public class ClusterSpecDTO implements Serializable {

  @JsonProperty("existing_cluster_id")
  private String existingClusterId;
  @JsonProperty("new_cluster")
  private NewClusterDTO newCluster;
  @JsonProperty("libraries")
  private LibraryDTO[] libraries;

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public void setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
  }

  public NewClusterDTO getNewCluster() {
    return newCluster;
  }

  public void setNewCluster(NewClusterDTO newCluster) {
    this.newCluster = newCluster;
  }

  public LibraryDTO[] getLibraries() {
    return libraries;
  }

  public void setLibraries(LibraryDTO[] libraries) {
    this.libraries = libraries;
  }
}
