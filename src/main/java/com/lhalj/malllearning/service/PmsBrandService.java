package com.lhalj.malllearning.service;

import com.lhalj.malllearning.mbg.model.PmsBrand;

import java.util.List;

/**
 * 描述:
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
