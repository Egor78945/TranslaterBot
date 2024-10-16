package org.example.translaterbot.configuration.telegram.bot.translater;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Configuration
public class TranslaterBotConfiguration extends TelegramLongPollingBot {
    private final String BOT_USERNAME;

    public TranslaterBotConfiguration(@Value("${bot.token}") String token, @Value("${bot.name}") String BOT_USERNAME) {
        super(token);
        this.BOT_USERNAME = BOT_USERNAME;
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
    }

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }
}
