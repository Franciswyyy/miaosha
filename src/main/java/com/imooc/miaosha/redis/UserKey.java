package com.imooc.miaosha.redis;

public class UserKey extends BasePrefix{

	private UserKey(String prefix) {   // 这就代表用不过期
		super(prefix);
	}
	public static UserKey getById = new UserKey("id");
	public static UserKey getByName = new UserKey("name");
}
