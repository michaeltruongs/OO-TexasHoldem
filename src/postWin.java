

public class postWin {
    expressionDecorator decorator;

    public void expression(int expressType){
        decorator = new expressionDecorator();
        # Allows the user to choose their expression after winning the hand
        if (expressType == 0){
            decorator = new Silent(decorator);
        } else if (expressType == 1){
            decorator = new Cheer(decorator);
        } else if (expressType == 2){
            decorator = new Standup(decorator);
        }

    }

    class Silent extends expressionDecorator {
        expressionDecorator decorator;
        public Silent(expressionDecorator decorator){
            this.decorator = decorator;
        }
        public String getExpressions(){
            return "Stayed Silent";
        }
    }

    class Cheer extends expressionDecorator {
        expressionDecorator decorator;
        public Cheer(expressionDecorator decorator){
            this.decorator = decorator;
        }
        public String getExpressions(){
            return "Cheered after winning hand";
        }
    }

    class Standup extends expressionDecorator {
        expressionDecorator decorator;
        public Standup(expressionDecorator decorator){
            this.decorator = decorator;
        }
        public String getExpressions(){
            return "Stood up!";
        }
    }
}

