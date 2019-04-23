package com.example.dao;

import com.example.model.ItripGuarantee;
import java.util.List;

public interface ItripGuaranteeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripGuarantee record);

    ItripGuarantee selectByPrimaryKey(Long id);

    List<ItripGuarantee> selectAll();

    int updateByPrimaryKey(ItripGuarantee record);
}