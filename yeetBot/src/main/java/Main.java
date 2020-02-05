import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.channel.text.TextChannelCreateEvent;
import net.dv8tion.jda.core.events.channel.text.update.TextChannelUpdateNSFWEvent;
import net.dv8tion.jda.core.events.message.MessageDeleteEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.events.message.MessageUpdateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NjU4NzIxNzU2NzUxODU1NjI5.XgD4lg.OUpWvqoz5RGZdNs-nglg1dMV6v0";
        builder.setToken(token);
        builder.addEventListener(new Main());
        builder.buildAsync();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.print("\nMessage from " + event.getAuthor().getName() + " : " + event.getMessage().getContentDisplay());
        // plugins
        /*
        if (event.getMessage().getContentRaw().contains("")){
            event.getChannel().sendMessage("").queue();
        }
        */
        // \help
        if (event.getMessage().getContentRaw().contains("\\help")) {
                event.getChannel().sendMessage("" +
                        "Before every command use \\\n" +
                        "yeet\n" +
                        "time\n" +
                        "date\n" +
                        "random video\n" +
                        "my avatar\n" +
                        "fuck off\n" +
                        "").queue();
            }
        // \yeet
        if (event.getMessage().getContentRaw().contains("\\yeet")) {
            event.getChannel().sendMessage("YEEEEEEEEEEEEEEEEEEET!").queue();
        }
        // \time
        if (event.getMessage().getContentRaw().contains("\\time")) {
            LocalDateTime DateTime = LocalDateTime.now();
            DateTimeFormatter Format = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedDateTime = DateTime.format(Format);

            event.getChannel().sendMessage(formattedDateTime).queue();
        }
        // \date
        if (event.getMessage().getContentRaw().contains("\\date")) {
            LocalDateTime DateTime = LocalDateTime.now();
            DateTimeFormatter Format = DateTimeFormatter.ofPattern("E, dd MMM yyyy");
            String formattedDateTime = DateTime.format(Format);

            event.getChannel().sendMessage(formattedDateTime).queue();
        }
        // random video
        if (event.getMessage().getContentRaw().contains("\\random video")){
            event.getChannel().sendMessage("https://www.youtube.com/watch?v=dQw4w9WgXcQ").queue();
        }
        // my avatar
        if (event.getMessage().getContentRaw().contains("\\my avatar")){
            String avatar = event.getAuthor().getAvatarUrl();
            event.getChannel().sendMessage(avatar).queue();
        }
        // fuck of {who}
        if (event.getMessage().getContentRaw().contains("\\fuck of")){
            String who = event.getMessage().getContentDisplay();
            String[] arr = who.split(" ", 0);
            event.getChannel().sendMessage("fuck off " + arr[2]).queue();
        }
        // ok
        if (event.getMessage().getContentRaw().contains("ok") && !event.getAuthor().isBot()){
            event.getChannel().sendMessage("OK BOOMER").queue();
        }
    }
    public void onMessageUpdate(MessageUpdateEvent event) {
        event.getChannel().sendMessage("Warum hast du message geupdatet?").queue();
    }
    public void onMessageDelete(MessageDeleteEvent event) {
        event.getChannel().sendMessage("Warum hast du message gedeletet?").queue();
    }
    public void onTextChannelUpdateNSFW(TextChannelUpdateNSFWEvent event) {
        if (event.getOldNSFW()) {
            event.getChannel().sendMessage("Nice!").queue();
        } else {
            event.getChannel().sendMessage("So sad!").queue();
        }
    }
    public void onTextChannelCreate(TextChannelCreateEvent event) {
        event.getChannel().sendMessage("Wasuuuuuuuuup!").queue();
    }
}
