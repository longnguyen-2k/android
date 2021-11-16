package com.example.jetnote.ui.components

import NoteColor
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetnote.domain.model.NoteModel
import com.example.jetnote.theme.rwGreen
import com.example.jetnote.util.fromHex
import kotlin.math.min

@ExperimentalMaterialApi
@Composable
fun Note(
    modifier: Modifier = Modifier,
    note: NoteModel,
    onNoteClick: (NoteModel) -> Unit,
    onNoteCheckedChange: (NoteModel) -> Unit,
    isSelected: Boolean
) {
    val background = if (isSelected) Color.LightGray else MaterialTheme.colors.surface
    val backgroundShape: Shape = RoundedCornerShape(4.dp)
    Card(
        shape = RoundedCornerShape(4.dp), modifier = modifier
            .padding()
            .fillMaxWidth(), backgroundColor = background
    ) {
        ListItem(
            text = { Text(text = note.title, maxLines = 1) },
            secondaryText = { Text(text = note.content, maxLines = 1) },
            icon = {
                NoteColor(color = Color.fromHex(note.color.hex), size = 40.dp, border = 1.dp)
            },
            trailing =
            {
                if (note.isCheckedOff != null) {
                    Checkbox(checked = note.isCheckedOff, onCheckedChange = { isChecked ->

                            val newNote = note.copy(isCheckedOff = isChecked)
                            onNoteCheckedChange.invoke(newNote)

                    }, modifier = Modifier.clickable {   onNoteClick.invoke(note)})
                }
            }
        )


    }

}


@Preview(showBackground = true)
@Composable
private fun NotePreview() {
    //Note()
}