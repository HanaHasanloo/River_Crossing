public class Node implements INode{

    private IState state;
    private INode motherNode;

    //---Constructor------------------------------------
    public Node(IState state, INode motherNode){

        this.motherNode = motherNode;
        this.state = state;
    }

    //--------------------------------------------------
    @Override
    public INode Clone(){

        IState copystate = new State();

        for (int i = 0; i < state.getPositions().length; i++)
            copystate.getPositions()[i] = state.getPositions()[i];

        return new Node(copystate, this);
    }

    //---------------------------------------
//    @Override
//    public boolean getEntityState(int i){
//
//
//    }

    //---Getter-------------------------------
    @Override
    public IState getState(){

        return state;
    }
}
