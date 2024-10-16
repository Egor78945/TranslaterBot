package org.example.translaterbot.configuration.telegram.bot.translater.initializer;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.example.translaterbot.configuration.telegram.bot.translater.TranslaterBotConfiguration;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Configuration
@RequiredArgsConstructor
public class TranslaterBotConnector {
    private final TelegramBotsApi telegramBotsApi;
    private final TranslaterBotConfiguration translaterBot;

    @PostConstruct
    public void connect() throws TelegramApiException {
        telegramBotsApi.registerBot(translaterBot);
    }
}
