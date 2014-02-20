/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.cdi.service;

import java.util.ArrayList;
import java.util.List;

import org.jboss.as.quickstarts.cdi.interceptor.AuditInterceptor;

/**
 * The class, that holds history of {@link ItemServiceBean} methods invocation. {@link AuditInterceptor} is responsible for
 * updating history.
 * 
 * @author ievgen.shulga
 */
public class History {
    private static List<String> itemHistory = new ArrayList<String>();

    public static List<String> getItemHistory() {
        return itemHistory;
    }

}
