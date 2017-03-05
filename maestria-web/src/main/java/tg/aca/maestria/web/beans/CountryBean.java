/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.aca.maestria.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import tg.aca.maestria.entities.Country;
import tg.aca.maestria.service.CountryServiceBean;
import tg.aca.maestria.service.CountryServiceBeanRemote;
import tg.aca.maestria.utils.AppConstants;
import tg.komilo.kore.service.GenericServiceBeanRemote;
import tg.komilo.kore.web.beans.GenericBean;

/**
 *
 * @author abdel.nambiema
 */
@ManagedBean
@ViewScoped
public class CountryBean extends GenericBean<Country, Integer> {

    @EJB
    private CountryServiceBeanRemote service;

    @Override
    public GenericServiceBeanRemote<Country, Integer> getService() {
        return this.service;
    }

    @Override
    public boolean canAdd() {
        return this.userService.isPermitted(AppConstants.PERM_BASEDATA_COUNTRY_ADD);
    }

    @Override
    public boolean canUpdate() {
        return this.userService.isPermitted(AppConstants.PERM_BASEDATA_COUNTRY_EDIT);
    }

    @Override
    public boolean canDelete() {
        return this.userService.isPermitted(AppConstants.PERM_BASEDATA_COUNTRY_DELETE);
    }

}
