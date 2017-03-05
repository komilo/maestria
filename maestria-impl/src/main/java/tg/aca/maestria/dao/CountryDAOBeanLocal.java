/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.aca.maestria.dao;

import javax.ejb.Local;
import tg.aca.maestria.entities.Country;
import tg.komilo.kore.dao.GenericDAOBeanLocal;

/**
 *
 * @author abdel.nambiema
 */
@Local
public interface CountryDAOBeanLocal extends GenericDAOBeanLocal<Country, Integer> {
        
}
