package com.example.spring2.imp;

/**
 * 代理对象
 */
public class ProxyMapper  implements BaseMapper {

    private BaseMapper baseMapper ;

    public ProxyMapper(BaseMapper baseMapper) {
        this.baseMapper = baseMapper;
    }

    @Override
    public void select() {
        System.out.println("代理方法");
        baseMapper.select();
    }
}
