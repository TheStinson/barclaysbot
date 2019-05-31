/**
 * Copyright 2017 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package com.barclaycard.hackathon.befuturemind.api.test.compatibility.v20150204_protocol_model;

import com.barclaycard.hackathon.befuturemind.api.model.Status;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class AIResponseV20150204 implements Serializable {
  private static final long serialVersionUID = 1L;

    /**
     * Unique identifier of the result.
     */
    @SerializedName("id")
    private String id;

    @SerializedName("timestamp")
    private Date timestamp;

    /**
     * Result object
     */
    @SerializedName("result")
    private ResultV20150204 result;

    @SerializedName("status")
    private Status status;

    /**
     * Unique identifier of the result.
     */
    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Result object
     */
    public ResultV20150204 getResult() {
        return result;
    }

    public void setResult(final ResultV20150204 result) {
        this.result = result;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(final Status status) {
        this.status = status;
    }

    public boolean isError() {
        if (status != null && status.getCode() != null && status.getCode() >= 400) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("AIResponse{id='%s', timestamp=%s, result=%s, status=%s}",
                id,
                timestamp,
                result,
                status);
    }

    public void cleanup() {
        if (result != null) {
            result.trimParameters();
        }
    }
}
