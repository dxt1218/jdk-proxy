package com.example.spring2.imp;

/**
 * 代理对象
 */
public class CountMapper implements BaseMapper {

    private BaseMapper baseMapper ;

    public CountMapper(BaseMapper baseMapper) {
        this.baseMapper = baseMapper;
    }

    @Override
    public void select() {
        System.out.println("统计方法");
        baseMapper.select();
    }
}
