package menu;

public class FinalScreen extends SubMenu {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4788191484979723684L;
	private MButton nextButton;

    public FinalScreen(String message, IMenuAction menu, boolean select) {
        super(1, menu);

        this.nextButton = new MButton(message);

        this.add(nextButton);

        if (select == false){
            nextButton.addActionListener((e -> this.menu.home()));
        }else if(select == true){
            nextButton.addActionListener((e -> this.menu.enterPlay()));
        }
    }

}