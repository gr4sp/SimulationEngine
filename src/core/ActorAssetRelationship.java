package core;

enum ActorAssetRelationshipType{
    OWN,LEASE,USE,OTHER;
}

public class ActorAssetRelationship {

    private Actor actor;
    private ActorAssetRelationshipType type; // ownership, lease
    private double percentage; //share of ownership over an asset
    private Asset asset;

    public ActorAssetRelationship(Actor actor, Asset asset, ActorAssetRelationshipType type, double percentage) {
        this.actor = actor;
        this.type = type;
        this.percentage = percentage;
        this.asset = asset;
    }

    public Actor getActor() {
        return actor;
    }

    public ActorAssetRelationshipType getType() {
        return type;
    }

    public double getPercentage() {
        return percentage;
    }

    public Asset getAsset() {
        return asset;
    }

}