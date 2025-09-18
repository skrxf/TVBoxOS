package com.github.catvod.crawler;

import android.content.Context;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bridge class to maintain compatibility with external JAR files
 * that expect Spider to be in com.github.catvod.crawler package.
 * This class extends the actual Spider implementation.
 */
public class Spider extends cn.xfywz.catvod.crawler.Spider {

    public static JSONObject empty = new JSONObject();

    public Spider() {
        super();
    }

    @Override
    public void init(Context context) {
        super.init(context);
    }

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
    }

    @Override
    public String homeContent(boolean filter) {
        return super.homeContent(filter);
    }

    @Override
    public String homeVideoContent() {
        return super.homeVideoContent();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        return super.categoryContent(tid, pg, filter, extend);
    }

    @Override
    public String detailContent(List<String> ids) {
        return super.detailContent(ids);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return super.searchContent(key, quick);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return super.playerContent(flag, id, vipFlags);
    }

    @Override
    public boolean isVideoFormat(String url) {
        return super.isVideoFormat(url);
    }

    @Override
    public boolean manualVideoCheck() {
        return super.manualVideoCheck();
    }

    @Override
    public String liveContent(String url) {
        return super.liveContent(url);
    }

    @Override
    public void cancelByTag() {
        super.cancelByTag();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public Object[] proxyLocal(Map<String, String> params) {
        return super.proxyLocal(params);
    }
}
