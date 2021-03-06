/*
 * Copyright 2014 Effektif GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.effektif.script;

import java.util.Map;

import com.effektif.workflow.impl.data.TypedValueImpl;



/**
 * @author Tom Baeyens
 */
public class ScriptResult {

  protected Object result;
  protected Throwable exception;
  protected String logs;
  protected Map<String,TypedValueImpl> updates;

  public Object getResult() {
    return result;
  }
  
  public void setResult(Object result) {
    this.result = result;
  }
  
  public Throwable getException() {
    return exception;
  }
  
  public void setException(Throwable exception) {
    this.exception = exception;
  }

  public String getLogs() {
    return logs;
  }
  
  public void setLogs(String logs) {
    this.logs = logs;
  }
  
  public Map<String, TypedValueImpl> getUpdates() {
    return updates;
  }
  
  public void setUpdates(Map<String, TypedValueImpl> updates) {
    this.updates = updates;
  }
}
