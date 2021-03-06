package com.java110.goods.bmo.productCategory;
import com.java110.po.product.ProductCategoryPo;
import org.springframework.http.ResponseEntity;

public interface IDeleteProductCategoryBMO {


    /**
     * 修改产品目录
     * add by wuxw
     * @param productCategoryPo
     * @return
     */
    ResponseEntity<String> delete(ProductCategoryPo productCategoryPo);


}
