package cn.xfywz.tv.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import cn.xfywz.tv.cache.Cache;
import cn.xfywz.tv.cache.CacheDao;
import cn.xfywz.tv.cache.VodCollect;
import cn.xfywz.tv.cache.VodCollectDao;
import cn.xfywz.tv.cache.VodRecord;
import cn.xfywz.tv.cache.VodRecordDao;


/**
 * 类描述:
 *
 * @author pj567
 * @since 2020/5/15
 */
@Database(entities = {Cache.class, VodRecord.class, VodCollect.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract CacheDao getCacheDao();

    public abstract VodRecordDao getVodRecordDao();

    public abstract VodCollectDao getVodCollectDao();
}
