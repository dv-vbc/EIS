/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.idealclover.java.fw.dao.eis.tax;

import net.idealclover.java.fw.po.eis.tax.TUser;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DragonFly
 */
@Repository("tuserMapper")
public interface ITUserMapper {
    
    TUser findByAccount(String account);
    
}
