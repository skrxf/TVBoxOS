package cn.xfywz.tv.player;

import android.content.Context;

import xyz.doikki.videoplayer.player.PlayerFactory;

public class ExoMediaPlayerFactory extends PlayerFactory<ExoPlayer> {

    public static ExoMediaPlayerFactory create() {
        return new ExoMediaPlayerFactory();
    }

    @Override
    public ExoPlayer createPlayer(Context context) {
        return new ExoPlayer(context);
    }
}