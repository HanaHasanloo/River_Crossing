public interface IState {
    
    boolean hasCrossed(EntityType entity);

    void moveEntity(EntityType entity);

    boolean equals(INode targetNode);

    int toNumber();

    //---Getter------------------------------
    boolean[] getPositions();


    
    //boolean equals();

    //hashCode();
}
