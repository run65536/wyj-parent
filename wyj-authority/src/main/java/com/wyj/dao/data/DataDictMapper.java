package com.wyj.dao.data;

import java.util.List;
import java.util.Map;

import com.wyj.dao.BaseMapper;
import com.wyj.entity.data.DataDict;

/**
 * 
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年8月23日 下午9:51:12
 */
public interface DataDictMapper extends BaseMapper<DataDict, Long> {

    /**
     * key=dictId value=dictName
     * @param groupCode
     * @return
     */
    List<Map<Long, String>> getDataDictByGroupCode(String groupCode);
    
    /**
     * key=dictCode value=dictName
     * @param groupCode
     * @return
     */
    List<Map<Long, String>> getDictCodeNameByGroupCode(String groupCode);
    
    int batchRemoveByDataGroupId(Long[] ids);
}
