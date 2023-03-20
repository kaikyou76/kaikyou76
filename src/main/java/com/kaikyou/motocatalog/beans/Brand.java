package com.kaikyou.motocatalog.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * バイクメーカー（ブランド）
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

    // ブランドID
    private String brandId;

    // ブランドID
    private String brandName;

}
