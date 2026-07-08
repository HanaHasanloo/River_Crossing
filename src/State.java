import java.util.Arrays;

public class State implements IState{

    private boolean[] positions;

    //---Constructor-------------------------
    public State(){

        positions = new boolean[7];
        Arrays.fill(positions, false);
    }

    //---------------------------------------
    @Override
    public boolean hasCrossed(EntityType entity){


    }

    @Override
    public void moveEntity(EntityType entity){


    }

    @Override
    public boolean equals(INode targetNode){

        boolean isEqual = true;

        for(int i = 0; i < positions.length; i++)
            if (positions[i] != targetNode.getState().getPositions()[i]){
                isEqual = false;
                break;
            }

        return isEqual;
    }


    @Override
    public int toNumber(){

        int number = 0;

        for (int i = 0; i < positions.length; i++)
            if (positions[i])
                number |= (1 << i);

        return number;        
    }

    
    public boolean[] getPositions(){

        return positions;
    }
}
