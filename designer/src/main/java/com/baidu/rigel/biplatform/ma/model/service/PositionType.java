/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.rigel.biplatform.ma.model.service;

/**
 * 条目所在位置定义
 *
 * @author wangyuxue
 * @version 1.0.0.1
 */
public enum PositionType {
    
    /**
     * 行
     */
    X,
    
    /**
     * 列
     */
    Y,
    
    /**
     * 过滤
     */
    S,
    
    /**
     * 候选维度
     */
    CAND_DIM,
    
    /**
     * 候选指标
     */
    CAND_IND;
}