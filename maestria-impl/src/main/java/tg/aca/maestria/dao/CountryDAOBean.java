/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.aca.maestria.dao;

import tg.aca.maestria.entities.Country;
import tg.komilo.kore.dao.GenericDAOBean;

/**
 *
 * @author abdel.nambiema
 */
public class CountryDAOBean extends GenericDAOBean<Country, Integer> implements CountryDAOBeanLocal {

    public CountryDAOBean() {
        super(Country.class);
    }
}
