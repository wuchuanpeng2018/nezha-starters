/*
 * Copyright (c) 2019-2020 kyle ju(Email: nezha@thirtyai.com  QQ: 17062743) All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thirtyai.nezha.web.security.jwt.host;

import cn.hutool.core.util.StrUtil;

import javax.servlet.http.HttpServletRequest;


public class ParameterTokenHost implements IJwtTokenHost {
	private final static int ORDER = 3;

	@Override
	public String getAccessToken(HttpServletRequest httpServletRequest) {
		String token = httpServletRequest.getParameter("token");
		if (StrUtil.isNotBlank(token)) {
			return token;
		}
		return null;
	}

	@Override
	public int getOrder() {
		return ORDER;
	}
}
