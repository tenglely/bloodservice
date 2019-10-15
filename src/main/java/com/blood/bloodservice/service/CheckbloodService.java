package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Checkblood;

/**
 * 	献血预约业务
 * @author HuangYuhan
 *
 */
public interface CheckbloodService {
	/**
	 * 	添加献血预约
	 * @param checkblood
	 * @return
	 */
	int addCheckblood(Checkblood checkblood);
}
