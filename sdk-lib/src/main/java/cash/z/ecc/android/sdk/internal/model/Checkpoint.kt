package cash.z.ecc.android.sdk.internal.model

import cash.z.ecc.android.sdk.model.BlockHeight

/**
 * Represents a checkpoint, which is used to speed sync times.
 *
 * @param height the height of the checkpoint.
 * @param hash the hash of the block at [height].
 * @param epochSeconds the time of the block at [height].
 * @param tree the sapling tree corresponding to [height].
 */
internal data class Checkpoint(
    val height: BlockHeight,
    val hash: String,
    // Note: this field does NOT match the name of the JSON, so will break with field-based JSON parsing
    val epochSeconds: Long,
    // Note: this field does NOT match the name of the JSON, so will break with field-based JSON parsing
    val tree: String
) {
    internal companion object
}
