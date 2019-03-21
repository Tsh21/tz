package com.igeek.exercise;

public class GoodsItem {
	// 成员变量
		/**  
		* @Fields name : 名称 
		*/  
		private String name;
		/**  
		* @Fields id : 货号  
		*/  
		private String id;
		/**  
		* @Fields price : 单价  
		*/  
		private double price;
		/**  
		* @Fields number : 数量  
		*/  
		private int number;
		/**  
		* @Fields unit : 计价单位  
		*/  
		private String unit;
		/**  
		* @Fields money : 金额  
		*/  
		private double money;

		// 构造方法
		/**  
		* @Title: GoodsItem      
		*/
		public GoodsItem() {
		}

		/**  
		* @Title: GoodsItem  
		* @param name
		* @param id
		* @param price
		* @param number
		* @param unit
		* @param money    
		*/
		public GoodsItem(String name, String id, double price, int number, String unit, double money) {
			this.name = name;
			this.id = id;
			this.price = price;
			this.number = number;
			this.unit = unit;
			this.money = money;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}

		/**
		 * @return the price
		 */
		public double getPrice() {
			return price;
		}

		/**
		 * @param price the price to set
		 */
		public void setPrice(double price) {
			this.price = price;
		}

		/**
		 * @return the number
		 */
		public int getNumber() {
			return number;
		}

		/**
		 * @param number the number to set
		 */
		public void setNumber(int number) {
			this.number = number;
		}

		/**
		 * @return the unit
		 */
		public String getUnit() {
			return unit;
		}

		/**
		 * @param unit the unit to set
		 */
		public void setUnit(String unit) {
			this.unit = unit;
		}

		/**
		 * @return the money
		 */
		public double getMoney() {
			return money;
		}

		/**
		 * @param money the money to set
		 */
		public void setMoney(double money) {
			this.money = money;
		}

}
