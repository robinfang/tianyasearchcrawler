package edu.hpcde.tianyasearchcrawler;

import java.util.Date;

/** 
 * ��˵�� 
 * @author  Fang 
 */

public class HeadInfo {
	public String title; //���ӱ���
	public String url; //����url
	public String userUrl; //�����û�url
	public String board; //���
	public Date datetime; //����ʱ��
	@Override
	public String toString() {
		return "HeadInfo [title=" + title + ", url=" + url + ", userUrl="
				+ userUrl + ", board=" + board + ", datetime=" + datetime + "]";
	}
	

}
