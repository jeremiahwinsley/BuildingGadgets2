package com.direwolf20.buildinggadgets2.common.network.data;

import com.direwolf20.buildinggadgets2.BuildingGadgets2;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record AnchorPayload(

) implements CustomPacketPayload {
    public static final AnchorPayload INSTANCE = new AnchorPayload();
    public static final Type<AnchorPayload> TYPE = new Type<>(new ResourceLocation(BuildingGadgets2.MODID, "anchor_payload"));

    @Override
    public Type<AnchorPayload> type() {
        return TYPE;
    }

    public static final StreamCodec<ByteBuf, AnchorPayload> STREAM_CODEC = StreamCodec.unit(INSTANCE);
}

