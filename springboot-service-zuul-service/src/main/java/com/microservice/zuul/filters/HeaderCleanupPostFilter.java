package com.microservice.zuul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

@Component
public class HeaderCleanupPostFilter extends ZuulFilter {
	
	@Override
    public String filterType() {
        return "post"; // Filtro que se ejecuta después de que la solicitud se ha enrutado
    }

    @Override
    public int filterOrder() {
        return 1; // Orden de ejecución del filtro
    }

    @Override
    public boolean shouldFilter() {
        return true; // Habilita el filtro
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();

        // Eliminar headers sensibles de la respuesta
        ctx.getZuulResponseHeaders().remove("Header-Sensible-3");
        ctx.getZuulResponseHeaders().remove("Header-Sensible-4");

        return null;
    }
}
