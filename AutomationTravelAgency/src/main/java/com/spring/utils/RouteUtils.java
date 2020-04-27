package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.entity.RouteEntity;
import com.spring.json.Route;
 

public class RouteUtils 
{
	public static List<Route> convertRouteEntityListToRouteList(List<RouteEntity> routeEntityList) {
		List<Route> routeList = new ArrayList<Route>();
		Consumer<RouteEntity> consumer = (RouteEntity routeEntity)->routeList.add(convertRouteEntityToRoute(routeEntity));
		routeEntityList.stream().forEach(consumer);
		return routeList;
	}
	
	public static Route convertRouteEntityToRoute(RouteEntity routeEntity) {
		return new Route(routeEntity.getRouteId(), routeEntity.getSource(),routeEntity.getDestination(),routeEntity.getDistance(),routeEntity.getTravelDuration());
	}

	public static RouteEntity convertRouteToRouteEntity(Route route) {
		return new RouteEntity(route.getSource(),route.getDestination(),route.getDistance(),route.getTravelDuration());
		}
}
