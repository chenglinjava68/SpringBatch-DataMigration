package com.javazx.batch.dao;

import com.javazx.batch.po.UserFrom;

import java.util.List;

/**
 * @author itmrchen
 * @date 2016/10/12
 * @time 13:19
 */
public interface UserFromMapper {

    List<UserFrom> selectAllInfo(int _skiprows, int _pagesize);
}
