package org.activiti.rest.explorer.application;
import org.activiti.rest.common.api.DefaultResource;
import org.activiti.rest.common.application.ActivitiRestApplication;
import org.activiti.rest.common.filter.JsonpFilter;
import org.activiti.rest.diagram.application.DiagramServicesInit;
import org.activiti.rest.editor.application.ModelerServicesInit;
import org.restlet.Restlet;
import org.restlet.routing.Router;
/**
 * Created with IntelliJ IDEA.
 * User: jinshunlong
 * Date: 13-11-29
 * Time: 下午1:26
 * To change this template use File | Settings | File Templates.
 */
public class ExplorerRestApplication extends ActivitiRestApplication
{
    public synchronized Restlet createInboundRoot()
    {
        Router router = new Router(getContext());
        router.attachDefault(DefaultResource.class);
        ModelerServicesInit.attachResources(router);
        DiagramServicesInit.attachResources(router);
        JsonpFilter jsonpFilter = new JsonpFilter(getContext());
        jsonpFilter.setNext(router);
        return jsonpFilter;
    }
}
