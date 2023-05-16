package com.ghores.digikalacompose.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/ghores/digikalacompose/navigation/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "withArgs", "args", "", "([Ljava/lang/Object;)Ljava/lang/String;", "Basket", "Category", "Home", "Profile", "Splash", "Lcom/ghores/digikalacompose/navigation/Screen$Basket;", "Lcom/ghores/digikalacompose/navigation/Screen$Category;", "Lcom/ghores/digikalacompose/navigation/Screen$Home;", "Lcom/ghores/digikalacompose/navigation/Screen$Profile;", "Lcom/ghores/digikalacompose/navigation/Screen$Splash;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String withArgs(@org.jetbrains.annotations.NotNull
    java.lang.Object... args) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ghores/digikalacompose/navigation/Screen$Splash;", "Lcom/ghores/digikalacompose/navigation/Screen;", "()V", "app_debug"})
    public static final class Splash extends com.ghores.digikalacompose.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.ghores.digikalacompose.navigation.Screen.Splash INSTANCE = null;
        
        private Splash() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ghores/digikalacompose/navigation/Screen$Home;", "Lcom/ghores/digikalacompose/navigation/Screen;", "()V", "app_debug"})
    public static final class Home extends com.ghores.digikalacompose.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.ghores.digikalacompose.navigation.Screen.Home INSTANCE = null;
        
        private Home() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ghores/digikalacompose/navigation/Screen$Category;", "Lcom/ghores/digikalacompose/navigation/Screen;", "()V", "app_debug"})
    public static final class Category extends com.ghores.digikalacompose.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.ghores.digikalacompose.navigation.Screen.Category INSTANCE = null;
        
        private Category() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ghores/digikalacompose/navigation/Screen$Basket;", "Lcom/ghores/digikalacompose/navigation/Screen;", "()V", "app_debug"})
    public static final class Basket extends com.ghores.digikalacompose.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.ghores.digikalacompose.navigation.Screen.Basket INSTANCE = null;
        
        private Basket() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ghores/digikalacompose/navigation/Screen$Profile;", "Lcom/ghores/digikalacompose/navigation/Screen;", "()V", "app_debug"})
    public static final class Profile extends com.ghores.digikalacompose.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.ghores.digikalacompose.navigation.Screen.Profile INSTANCE = null;
        
        private Profile() {
            super(null);
        }
    }
}