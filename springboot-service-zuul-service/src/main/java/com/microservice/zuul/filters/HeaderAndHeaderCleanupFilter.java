package com.microservice.zuul.filters;

import com.netflix.zuul.ZuulFilter;

import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

@Component
public class HeaderAndHeaderCleanupFilter extends ZuulFilter {

	@Override
    public String filterType() {
        return "pre"; // Filtro que se ejecuta antes de la petición se enrutada
    }

    @Override
    public int filterOrder() {
        return 2; // Orden de ejecución del filtro
    }

    @Override
    public boolean shouldFilter() {
        return true; // Habilita el filtro
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();

        // Agregar un header a la petición
        ctx.addZuulRequestHeader("X-Request-ID", "valor-del-header");

        // Eliminar headers sensibles de la respuesta
        ctx.getZuulResponseHeaders().remove("Header-Sensible-1");
        ctx.getZuulResponseHeaders().remove("Header-Sensible-2");

        return null;
    }

}
