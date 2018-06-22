package com.test;


/**
 * 项目名称: XujianTest
 * 类描述: Dichotomy
 * 创建人: 徐健
 * 创建时间: 2017年9月8日上午11:10:23
 */
public class Dichotomy {
	
	/**
	 * 
	 * @方法功能描述：递归法二分查找
	 * @方法参数描述：@param key
	 * @方法参数描述：@param a
	 * @方法参数描述：@return
	 * @方法返回值：int
	 * @创建人: 徐健
	 * @创建时间: 2017年9月8日上午11:16:20
	 */
	public static int rank(int key,int[] a) {
		int res = rank(key, a,0,a.length-1);
		System.out.println(res);
		return res;
	}
	
	/**
	 * 
	 * @方法功能描述：二分查找
	 * @方法参数描述：@param key
	 * @方法参数描述：@param a
	 * @方法参数描述：@param lo
	 * @方法参数描述：@param hi
	 * @方法参数描述：@return
	 * @方法返回值：int key所在数组下标位置
	 * @创建人: 徐健
	 * @创建时间: 2017年9月8日上午11:16:35
	 */
	public static int rank(int key,int[] a,int lo,int hi) {
		//如果key存在于a[]中,它的索引不会小于lo,且不会大于hi
		if (lo>hi)  return -1;
		int mid=lo+(hi-lo)/2;
		if(key<a[mid]) return rank(key,a,lo,mid-1);
		else if(key>a[mid]) return rank(key,a,mid+1,hi);
		else return mid;
	}
	
	public static void main(String[] args) {
		int a[]={0,2,4,8,15,20,26,31,58};
		rank(15,a);
	}

}
