package src.scenes;

public enum Location {
    FOREST(true),
    DEEP_WOODS(true),
    LAKE(true),
    DESERT(true),
    MOUNTAIN(true),
    HIGH_MOUNTAIN(true),
    PLAINS(true),
    SWAMP(true);
    
    private final Boolean exploreMenu;
    
    Location(Boolean goesInExploreMenu) {
        this.exploreMenu = goesInExploreMenu;
    }
    
    public Boolean goesInExploreMenu() {
        return this.exploreMenu;
    }
    public Boolean goesInPlacesMenu() {
        return !this.exploreMenu;
    }
}
