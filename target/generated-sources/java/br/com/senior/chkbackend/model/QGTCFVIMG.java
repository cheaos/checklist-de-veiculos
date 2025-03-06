package br.com.senior.chkbackend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGTCFVIMG is a Querydsl query type for GTCFVIMG
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGTCFVIMG extends EntityPathBase<GTCFVIMG> {

    private static final long serialVersionUID = 1689814255L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGTCFVIMG gTCFVIMG = new QGTCFVIMG("gTCFVIMG");

    public final NumberPath<Integer> cdOcorrencia = createNumber("cdOcorrencia", Integer.class);

    public final StringPath dsCaminhoArquivo = createString("dsCaminhoArquivo");

    public final StringPath dsNomeArquivo = createString("dsNomeArquivo");

    public final StringPath dsOcorrencia = createString("dsOcorrencia");

    public final QGTCFVIMGId pk;

    public QGTCFVIMG(String variable) {
        this(GTCFVIMG.class, forVariable(variable), INITS);
    }

    public QGTCFVIMG(Path<? extends GTCFVIMG> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGTCFVIMG(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGTCFVIMG(PathMetadata metadata, PathInits inits) {
        this(GTCFVIMG.class, metadata, inits);
    }

    public QGTCFVIMG(Class<? extends GTCFVIMG> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pk = inits.isInitialized("pk") ? new QGTCFVIMGId(forProperty("pk")) : null;
    }

}

