
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.info.service; 
 
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * UserService Tester
*/ 
public class UserServiceTest { 

    UserService userService = new UserService();
 
    @BeforeEach
    @DisplayName("Each unit test method is executed once before execution")
    public void before() throws Exception {
    }
 
    @AfterEach
    @DisplayName("Each unit test method is executed once after execution")
    public void after() throws Exception {
    }
 
 
    @Test
    public void testShow() throws Exception {
        String nameShow = userService.show("tom");
        System.out.println(nameShow);
    } 
 
 
} 
