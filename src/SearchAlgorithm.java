import java.util.LinkedList;

public class SearchAlgorithm implements ISearchAlgorithm{

    private LinkedList<INode> unexpandedNodes;
    private LinkedList<INode> expandedNodes;

    private boolean isValid(INode node){

        if ()
    }

    private boolean isGoal(INode node){

        boolean ok = true;

        for(int i = 0; i < 7; i++)
            if (!node.getEntityState(i))
                ok = false;

        return ok;
    }

    private LinkedList<INode> generateChildren(Node node){

    }

    @Override
    public INode search(Node starterNode){

    }
}
