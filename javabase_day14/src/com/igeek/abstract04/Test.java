package com.igeek.abstract04;

/**
 * @author zx
 * @date 2019年3月20日
 * @version 1.0
 * @description：
 *  20岁1.75米的男孩慕容紫英有一个18岁1.6米瓜子脸女朋友欧阳青青
	欧阳青青在洗一件白色的李宁牌子的衣服
	慕容紫英去散步(和欧阳青青)
	慕容紫英用带有阳刚之气的声音对欧阳青青说:我会守护你一生一世
	欧阳青青微笑着用于甜美的声音对慕容紫英说:有你在我就安心.

 */
public class Test {

	public static void main(String[] args) {
		Clothes clothes = new Clothes("白色", "李宁");
		Girl girl = new Girl("欧阳青青", 18, 1.6, "瓜子脸");
		girl.wash(clothes);
		Boy boy = new Boy("慕容紫英", 20, 1.75, girl);
		boy.walking();
		boy.say("我会守护你一生一世");
		girl.say("有你在我就安心");
	}

}
