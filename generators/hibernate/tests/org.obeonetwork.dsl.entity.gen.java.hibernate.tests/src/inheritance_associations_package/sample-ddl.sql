-- Start of user code DB Name
-- TODO specify the name of database used
USE sample;
-- End of user code

-- Tables for Entity Class_01_01 

DROP TABLE IF EXISTS CLASS_01_01;
CREATE TABLE CLASS_01_01
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |1|-->1
	FK_CLASS_01_01_END_TARGET_ID CHAR(32) UNIQUE,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_01_END 

DROP TABLE IF EXISTS CLASS_01_01_END;
CREATE TABLE CLASS_01_01_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_01_BI 

DROP TABLE IF EXISTS CLASS_01_01_BI;
CREATE TABLE CLASS_01_01_BI
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |1|<-->1
	FK_CLASS_01_01_BI_END_TARGET_ID CHAR(32) UNIQUE,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_01_BI_END 

DROP TABLE IF EXISTS CLASS_01_01_BI_END;
CREATE TABLE CLASS_01_01_BI_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_1_01 

DROP TABLE IF EXISTS CLASS_1_01;
CREATE TABLE CLASS_1_01
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |1|-->1
	FK_CLASS_1_01_END_TARGET_ID CHAR(32) UNIQUE,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_1_01_END 

DROP TABLE IF EXISTS CLASS_1_01_END;
CREATE TABLE CLASS_1_01_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_1_01_BI 

DROP TABLE IF EXISTS CLASS_1_01_BI;
CREATE TABLE CLASS_1_01_BI
(
	ID CHAR(32) NOT NULL,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_1_01_BI_END 

DROP TABLE IF EXISTS CLASS_1_01_BI_END;
CREATE TABLE CLASS_1_01_BI_END
(
	ID CHAR(32) NOT NULL,
	-- |1|<-->1
	FK_CLASS_1_01_BI_SOURCE_ID CHAR(32) UNIQUE NOT NULL,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_1 

DROP TABLE IF EXISTS CLASS_01_1;
CREATE TABLE CLASS_01_1
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |1|-->1
	FK_CLASS_01_1_END_TARGET_ID CHAR(32) UNIQUE NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_1_END 

DROP TABLE IF EXISTS CLASS_01_1_END;
CREATE TABLE CLASS_01_1_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_1_BI 

DROP TABLE IF EXISTS CLASS_01_1_BI;
CREATE TABLE CLASS_01_1_BI
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |1|<-->1
	FK_CLASS_01_1_BI_END_TARGET_ID CHAR(32) UNIQUE NOT NULL,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_1_BI_END 

DROP TABLE IF EXISTS CLASS_01_1_BI_END;
CREATE TABLE CLASS_01_1_BI_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_1_1 

DROP TABLE IF EXISTS CLASS_1_1;
CREATE TABLE CLASS_1_1
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |1|-->1
	FK_CLASS_1_1_END_TARGET_ID CHAR(32) UNIQUE NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_1_1_END 

DROP TABLE IF EXISTS CLASS_1_1_END;
CREATE TABLE CLASS_1_1_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_1_1_BI 

DROP TABLE IF EXISTS CLASS_1_1_BI;
CREATE TABLE CLASS_1_1_BI
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_1_1_BI_END 

DROP TABLE IF EXISTS CLASS_1_1_BI_END;
CREATE TABLE CLASS_1_1_BI_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |1|<-->1
	FK_CLASS_1_1_BI_SOURCE_ID CHAR(32) UNIQUE NOT NULL,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_Many 

DROP TABLE IF EXISTS CLASS_01_MANY;
CREATE TABLE CLASS_01_MANY
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_Many_END 

DROP TABLE IF EXISTS CLASS_01_MANY_END;
CREATE TABLE CLASS_01_MANY_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_Many_BI 

DROP TABLE IF EXISTS CLASS_01_MANY_BI;
CREATE TABLE CLASS_01_MANY_BI
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_Many_BI_END 

DROP TABLE IF EXISTS CLASS_01_MANY_BI_END;
CREATE TABLE CLASS_01_MANY_BI_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |*|<-->1
	FK_CLASS_01_MANY_BI_SOURCE_ID CHAR(32) UNIQUE,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_Many_01 

DROP TABLE IF EXISTS CLASS_MANY_01;
CREATE TABLE CLASS_MANY_01
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |*|-->1
	FK_CLASS_MANY_01_END_TARGET_ID CHAR(32) UNIQUE,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_Many_01_END 

DROP TABLE IF EXISTS CLASS_MANY_01_END;
CREATE TABLE CLASS_MANY_01_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_Many_01_BI 

DROP TABLE IF EXISTS CLASS_MANY_01_BI;
CREATE TABLE CLASS_MANY_01_BI
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	-- |*|<-->1
	FK_CLASS_MANY_01_BI_END_TARGET_ID CHAR(32) UNIQUE,

	PRIMARY KEY (ID)
);

-- Tables for Entity Class_Many_01_BI_END 

DROP TABLE IF EXISTS CLASS_MANY_01_BI_END;
CREATE TABLE CLASS_MANY_01_BI_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_Many_Many 

DROP TABLE IF EXISTS CLASS_MANY_MANY;
CREATE TABLE CLASS_MANY_MANY
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- |*|-->*
DROP TABLE IF EXISTS CLASS_MANY_MANY_CLASS_MANY_MANY_END;
CREATE TABLE CLASS_MANY_MANY_CLASS_MANY_MANY_END
(
	CLASS_MANY_MANY_ID CHAR(32) NOT NULL,
	CLASS_MANY_MANY_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (CLASS_MANY_MANY_ID, CLASS_MANY_MANY_END_ID)
);
-- Tables for Entity Class_Many_Many_End 

DROP TABLE IF EXISTS CLASS_MANY_MANY_END;
CREATE TABLE CLASS_MANY_MANY_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_Many_Many_BI 

DROP TABLE IF EXISTS CLASS_MANY_MANY_BI;
CREATE TABLE CLASS_MANY_MANY_BI
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- |*|<-->*
DROP TABLE IF EXISTS CLASS_MANY_MANY_BI_CLASS_MANY_MANY_BI_END;
CREATE TABLE CLASS_MANY_MANY_BI_CLASS_MANY_MANY_BI_END
(
	CLASS_MANY_MANY_BI_ID CHAR(32) NOT NULL,
	CLASS_MANY_MANY_BI_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (CLASS_MANY_MANY_BI_ID, CLASS_MANY_MANY_BI_END_ID)
);
-- Tables for Entity Class_Many_Many_BI_END 

DROP TABLE IF EXISTS CLASS_MANY_MANY_BI_END;
CREATE TABLE CLASS_MANY_MANY_BI_END
(
	ID CHAR(32) NOT NULL,
	FAKE_ATTR VARCHAR(255) NOT NULL,
	PRIMARY KEY (ID)
);

-- Tables for Entity Class_01_01_END_Sub 

DROP TABLE IF EXISTS CLASS_01_01_END_SUB;
CREATE TABLE CLASS_01_01_END_SUB
(
	FK_INHERITS_CLASS_01_01_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_01_END_ID)
);

-- Tables for Entity Class_01_01_BI_END_Sub 

DROP TABLE IF EXISTS CLASS_01_01_BI_END_SUB;
CREATE TABLE CLASS_01_01_BI_END_SUB
(
	FK_INHERITS_CLASS_01_01_BI_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_01_BI_END_ID)
);

-- Tables for Entity Class_1_01_End_Sub 

DROP TABLE IF EXISTS CLASS_1_01_END_SUB;
CREATE TABLE CLASS_1_01_END_SUB
(
	FK_INHERITS_CLASS_1_01_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_1_01_END_ID)
);

-- Tables for Entity Class_1_01_BI_END_Sub 

DROP TABLE IF EXISTS CLASS_1_01_BI_END_SUB;
CREATE TABLE CLASS_1_01_BI_END_SUB
(
	FK_INHERITS_CLASS_1_01_BI_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_1_01_BI_END_ID)
);

-- Tables for Entity Class_01_1_END_Sub 

DROP TABLE IF EXISTS CLASS_01_1_END_SUB;
CREATE TABLE CLASS_01_1_END_SUB
(
	FK_INHERITS_CLASS_01_1_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_1_END_ID)
);

-- Tables for Entity Class_01_1_Bi_END_Sub 

DROP TABLE IF EXISTS CLASS_01_1_BI_END_SUB;
CREATE TABLE CLASS_01_1_BI_END_SUB
(
	FK_INHERITS_CLASS_01_1_BI_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_1_BI_END_ID)
);

-- Tables for Entity Class_1_1_END_Sub 

DROP TABLE IF EXISTS CLASS_1_1_END_SUB;
CREATE TABLE CLASS_1_1_END_SUB
(
	FK_INHERITS_CLASS_1_1_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_1_1_END_ID)
);

-- Tables for Entity Class_1_1_BI_END_Sub 

DROP TABLE IF EXISTS CLASS_1_1_BI_END_SUB;
CREATE TABLE CLASS_1_1_BI_END_SUB
(
	FK_INHERITS_CLASS_1_1_BI_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_1_1_BI_END_ID)
);

-- Tables for Entity Class_01_Many_END_Sub 

DROP TABLE IF EXISTS CLASS_01_MANY_END_SUB;
CREATE TABLE CLASS_01_MANY_END_SUB
(
	FK_INHERITS_CLASS_01_MANY_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_MANY_END_ID)
);

-- Tables for Entity Class_01_Many_BI_END_Sub 

DROP TABLE IF EXISTS CLASS_01_MANY_BI_END_SUB;
CREATE TABLE CLASS_01_MANY_BI_END_SUB
(
	FK_INHERITS_CLASS_01_MANY_BI_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_MANY_BI_END_ID)
);

-- Tables for Entity Class_Many_01_END_Sub 

DROP TABLE IF EXISTS CLASS_MANY_01_END_SUB;
CREATE TABLE CLASS_MANY_01_END_SUB
(
	FK_INHERITS_CLASS_MANY_01_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_MANY_01_END_ID)
);

-- Tables for Entity Class_Many_01_BI_END_Sub 

DROP TABLE IF EXISTS CLASS_MANY_01_BI_END_SUB;
CREATE TABLE CLASS_MANY_01_BI_END_SUB
(
	FK_INHERITS_CLASS_MANY_01_BI_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_MANY_01_BI_END_ID)
);

-- Tables for Entity Class_Many_Many_End_Sub 

DROP TABLE IF EXISTS CLASS_MANY_MANY_END_SUB;
CREATE TABLE CLASS_MANY_MANY_END_SUB
(
	FK_INHERITS_CLASS_MANY_MANY_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_MANY_MANY_END_ID)
);

-- Tables for Entity Class_Many_Many_BI_END_Sub 

DROP TABLE IF EXISTS CLASS_MANY_MANY_BI_END_SUB;
CREATE TABLE CLASS_MANY_MANY_BI_END_SUB
(
	FK_INHERITS_CLASS_MANY_MANY_BI_END_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_MANY_MANY_BI_END_ID)
);

-- Tables for Entity Class_01_01_Sub 

DROP TABLE IF EXISTS CLASS_01_01_SUB;
CREATE TABLE CLASS_01_01_SUB
(
	FK_INHERITS_CLASS_01_01_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_01_ID)
);

-- Tables for Entity Class_01_01_BI_Sub 

DROP TABLE IF EXISTS CLASS_01_01_BI_SUB;
CREATE TABLE CLASS_01_01_BI_SUB
(
	FK_INHERITS_CLASS_01_01_BI_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_01_BI_ID)
);

-- Tables for Entity Class_1_01_Sub 

DROP TABLE IF EXISTS CLASS_1_01_SUB;
CREATE TABLE CLASS_1_01_SUB
(
	FK_INHERITS_CLASS_1_01_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_1_01_ID)
);

-- Tables for Entity Class_1_01_BI_Sub 

DROP TABLE IF EXISTS CLASS_1_01_BI_SUB;
CREATE TABLE CLASS_1_01_BI_SUB
(
	FK_INHERITS_CLASS_1_01_BI_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_1_01_BI_ID)
);

-- Tables for Entity Class_01_1_Sub 

DROP TABLE IF EXISTS CLASS_01_1_SUB;
CREATE TABLE CLASS_01_1_SUB
(
	FK_INHERITS_CLASS_01_1_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_1_ID)
);

-- Tables for Entity Class_01_1_BI_Sub 

DROP TABLE IF EXISTS CLASS_01_1_BI_SUB;
CREATE TABLE CLASS_01_1_BI_SUB
(
	FK_INHERITS_CLASS_01_1_BI_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_1_BI_ID)
);

-- Tables for Entity Class_1_1_Sub 

DROP TABLE IF EXISTS CLASS_1_1_SUB;
CREATE TABLE CLASS_1_1_SUB
(
	FK_INHERITS_CLASS_1_1_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_1_1_ID)
);

-- Tables for Entity Class_1_1_BI_Sub 

DROP TABLE IF EXISTS CLASS_1_1_BI_SUB;
CREATE TABLE CLASS_1_1_BI_SUB
(
	FK_INHERITS_CLASS_1_1_BI_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_1_1_BI_ID)
);

-- Tables for Entity Class_01_Many_Sub 

DROP TABLE IF EXISTS CLASS_01_MANY_SUB;
CREATE TABLE CLASS_01_MANY_SUB
(
	FK_INHERITS_CLASS_01_MANY_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_MANY_ID)
);

-- Tables for Entity Class_01_Many_BI_Sub 

DROP TABLE IF EXISTS CLASS_01_MANY_BI_SUB;
CREATE TABLE CLASS_01_MANY_BI_SUB
(
	FK_INHERITS_CLASS_01_MANY_BI_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_01_MANY_BI_ID)
);

-- Tables for Entity Class_Many_01_Sub 

DROP TABLE IF EXISTS CLASS_MANY_01_SUB;
CREATE TABLE CLASS_MANY_01_SUB
(
	FK_INHERITS_CLASS_MANY_01_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_MANY_01_ID)
);

-- Tables for Entity Class_Many_01_BI_Sub 

DROP TABLE IF EXISTS CLASS_MANY_01_BI_SUB;
CREATE TABLE CLASS_MANY_01_BI_SUB
(
	FK_INHERITS_CLASS_MANY_01_BI_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_MANY_01_BI_ID)
);

-- Tables for Entity Class_Many_Many_Sub 

DROP TABLE IF EXISTS CLASS_MANY_MANY_SUB;
CREATE TABLE CLASS_MANY_MANY_SUB
(
	FK_INHERITS_CLASS_MANY_MANY_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_MANY_MANY_ID)
);

-- Tables for Entity Class_Many_Many_BI_Sub 

DROP TABLE IF EXISTS CLASS_MANY_MANY_BI_SUB;
CREATE TABLE CLASS_MANY_MANY_BI_SUB
(
	FK_INHERITS_CLASS_MANY_MANY_BI_ID CHAR(32) NOT NULL,
	PRIMARY KEY (FK_INHERITS_CLASS_MANY_MANY_BI_ID)
);

