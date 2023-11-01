import net.dv8tion.jda.api.*;

public class SimpleBot {

    public static void main(String[] args) {
        JDABuilder jdaBuilder = JDABuilder.createDefault("YOUR_BOT_TOKEN");
        
        // Event handler for bot ready event
        jdaBuilder.addEventListeners(new ListenerAdapter() {
            @Override
            public void onReady(ReadyEvent event) {
                System.out.println("Bot is ready!");
            }
        });

        try {
            JDA jda = jdaBuilder.build();
            jda.awaitReady();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
