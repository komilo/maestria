/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.aca.maestria.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.aca.maestria.dao.CountryDAOBeanLocal;
import tg.aca.maestria.entities.Country;
import tg.komilo.kore.dao.GenericDAOBeanLocal;
import tg.komilo.kore.service.GenericServiceBean;

/**
 *
 * @author abdel.nambiema
 */
@Stateless
public class CountryServiceBean extends GenericServiceBean<Country, Integer> implements CountryServiceBeanRemote {

    @EJB
    private CountryDAOBeanLocal dao;

    @Override
    protected GenericDAOBeanLocal<Country, Integer> getDAO() {
        return this.dao;
    }

    @Override
    public Integer getId(Country e) {
        return e.getId();
    }

}
