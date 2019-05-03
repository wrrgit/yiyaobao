package com.yiyaobao.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yiyaobao.entity.Medicine;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MEDICINE".
*/
public class MedicineDao extends AbstractDao<Medicine, Long> {

    public static final String TABLENAME = "MEDICINE";

    /**
     * Properties of entity Medicine.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Number = new Property(2, String.class, "number", false, "NUMBER");
        public final static Property Changshang = new Property(3, String.class, "changshang", false, "CHANGSHANG");
        public final static Property GuiGe = new Property(4, String.class, "guiGe", false, "GUI_GE");
        public final static Property Type = new Property(5, String.class, "type", false, "TYPE");
        public final static Property JiXing = new Property(6, String.class, "jiXing", false, "JI_XING");
        public final static Property InPrice = new Property(7, float.class, "inPrice", false, "IN_PRICE");
        public final static Property OutPrice = new Property(8, float.class, "outPrice", false, "OUT_PRICE");
        public final static Property FuHe = new Property(9, int.class, "fuHe", false, "FU_HE");
    }


    public MedicineDao(DaoConfig config) {
        super(config);
    }
    
    public MedicineDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MEDICINE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT NOT NULL ," + // 1: name
                "\"NUMBER\" TEXT," + // 2: number
                "\"CHANGSHANG\" TEXT," + // 3: changshang
                "\"GUI_GE\" TEXT," + // 4: guiGe
                "\"TYPE\" TEXT," + // 5: type
                "\"JI_XING\" TEXT," + // 6: jiXing
                "\"IN_PRICE\" REAL NOT NULL ," + // 7: inPrice
                "\"OUT_PRICE\" REAL NOT NULL ," + // 8: outPrice
                "\"FU_HE\" INTEGER NOT NULL );"); // 9: fuHe
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MEDICINE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Medicine entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getName());
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(3, number);
        }
 
        String changshang = entity.getChangshang();
        if (changshang != null) {
            stmt.bindString(4, changshang);
        }
 
        String guiGe = entity.getGuiGe();
        if (guiGe != null) {
            stmt.bindString(5, guiGe);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
 
        String jiXing = entity.getJiXing();
        if (jiXing != null) {
            stmt.bindString(7, jiXing);
        }
        stmt.bindDouble(8, entity.getInPrice());
        stmt.bindDouble(9, entity.getOutPrice());
        stmt.bindLong(10, entity.getFuHe());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Medicine entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getName());
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(3, number);
        }
 
        String changshang = entity.getChangshang();
        if (changshang != null) {
            stmt.bindString(4, changshang);
        }
 
        String guiGe = entity.getGuiGe();
        if (guiGe != null) {
            stmt.bindString(5, guiGe);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
 
        String jiXing = entity.getJiXing();
        if (jiXing != null) {
            stmt.bindString(7, jiXing);
        }
        stmt.bindDouble(8, entity.getInPrice());
        stmt.bindDouble(9, entity.getOutPrice());
        stmt.bindLong(10, entity.getFuHe());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Medicine readEntity(Cursor cursor, int offset) {
        Medicine entity = new Medicine( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // number
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // changshang
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // guiGe
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // type
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // jiXing
            cursor.getFloat(offset + 7), // inPrice
            cursor.getFloat(offset + 8), // outPrice
            cursor.getInt(offset + 9) // fuHe
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Medicine entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.getString(offset + 1));
        entity.setNumber(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setChangshang(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setGuiGe(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setType(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setJiXing(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setInPrice(cursor.getFloat(offset + 7));
        entity.setOutPrice(cursor.getFloat(offset + 8));
        entity.setFuHe(cursor.getInt(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Medicine entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Medicine entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Medicine entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}