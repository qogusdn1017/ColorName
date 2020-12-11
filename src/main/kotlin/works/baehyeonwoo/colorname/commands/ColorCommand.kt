/*
 * Copyright (c) 2020 BaeHyeonWoo
 *
 *  Licensed under the General Public License, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/gpl-3.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package works.baehyeonwoo.colorname.commands

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.entity.Player

/**
 * @author BaeHyeonWoo
 */

class ColorCommand : CommandExecutor, TabCompleter {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            if (args.count() == 1) {
                args[0].let {
                    when (it) {
                        "RED" -> {
                            sender.setDisplayName("${ChatColor.RED}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.RED}${sender.name}.")
                        }
                        "BLUE" -> {
                            sender.setDisplayName("${ChatColor.BLUE}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.BLUE}${sender.name}.")
                        }
                        "YELLOW" -> {
                            sender.setDisplayName("${ChatColor.YELLOW}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.YELLOW}${sender.name}.")
                        }
                        "GREEN" -> {
                            sender.setDisplayName("${ChatColor.GREEN}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.GREEN}${sender.name}.")
                        }
                        "GOLD" -> {
                            sender.setDisplayName("${ChatColor.GOLD}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.GOLD}${sender.name}.")
                        }
                        "DARK_GREEN" -> {
                            sender.setDisplayName("${ChatColor.DARK_GREEN}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.DARK_GREEN}${sender.name}.")
                        }
                        "DARK_BLUE" -> {
                            sender.setDisplayName("${ChatColor.DARK_BLUE}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.DARK_BLUE}${sender.name}.")
                        }
                        "DARK_PURPLE" -> {
                            sender.setDisplayName("${ChatColor.DARK_PURPLE}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.DARK_PURPLE}${sender.name}.")
                        }
                        "DARK_GRAY" -> {
                            sender.setDisplayName("${ChatColor.DARK_GRAY}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.DARK_GRAY}${sender.name}.")
                        }
                        "DARK_AQUA" -> {
                            sender.setDisplayName("${ChatColor.DARK_AQUA}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.DARK_AQUA}${sender.name}.")
                        }
                        "DARK_RED" -> {
                            sender.setDisplayName("${ChatColor.DARK_RED}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.DARK_RED}${sender.name}.")
                        }
                        "AQUA" -> {
                            sender.setDisplayName("${ChatColor.AQUA}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.AQUA}${sender.name}.")
                        }
                        "BLACK" -> {
                            sender.setDisplayName("${ChatColor.BLACK}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.BLACK}${sender.name}.")
                        }
                        "BOLD" -> {
                            sender.setDisplayName("${ChatColor.BOLD}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.BOLD}${sender.name}.")
                        }
                        "GRAY" -> {
                            sender.setDisplayName("${ChatColor.GRAY}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.GRAY}${sender.name}.")
                        }
                        "ITALIC" -> {
                            sender.setDisplayName("${ChatColor.ITALIC}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.ITALIC}${sender.name}.")
                        }
                        "LIGHT_PURPLE" -> {
                            sender.setDisplayName("${ChatColor.LIGHT_PURPLE}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.LIGHT_PURPLE}${sender.name}.")
                        }
                        "MAGIC" -> {
                            sender.setDisplayName("${ChatColor.MAGIC}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.MAGIC}${sender.name}.")
                        }
                        "RESET" -> {
                            sender.setDisplayName("${ChatColor.RESET}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.RESET}${sender.name}.")
                        }
                        "STRIKETHROUGH" -> {
                            sender.setDisplayName("${ChatColor.STRIKETHROUGH}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.STRIKETHROUGH}${sender.name}.")
                        }
                        "UNDERLINE" -> {
                            sender.setDisplayName("${ChatColor.UNDERLINE}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.UNDERLINE}${sender.name}.")
                        }
                        "WHITE" -> {
                            sender.setDisplayName("${ChatColor.WHITE}${sender.name}")
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] Set your own DisplayName color to ${ChatColor.WHITE}${sender.name}.")
                        }
                        else -> {
                            sender.sendMessage("${ChatColor.GREEN}[ColorName] ${ChatColor.WHITE}Supported Colors : AQUA, BLACK, BLUE, BOLD, DARK_AQUA, DARK_BLUE, DARK_GRAY, DARK_GREEN, DARK_PURPLE, DARK_RED, GOLD, GRAY, GREEN, ITALIC, LIGHT_PURPLE, MAGIC, RED, STRIKETHROUGH, UNDERLINE, WHITE, YELLOW\n")
                            return true
                        }
                    }
                }
            }
                else {
                    sender.sendMessage("${ChatColor.GREEN}[ColorName] ${ChatColor.RED}Incorrect arguments. Usage : /color [ColorType]\n" +
                            "${ChatColor.WHITE}Supported Colors : AQUA, BLACK, BLUE, BOLD, DARK_AQUA, DARK_BLUE, DARK_GRAY, DARK_GREEN, DARK_PURPLE, DARK_RED, GOLD, GRAY, GREEN, ITALIC, LIGHT_PURPLE, MAGIC, RED, STRIKETHROUGH, UNDERLINE, WHITE, YELLOW\n" +
                            "Use /color RESET to reset.")
            }
        } else {
            sender.sendMessage("${ChatColor.GREEN}[ColorName] ${ChatColor.RED}Please use this command in-game.")
        }
        return true
    }

    override fun onTabComplete(sender: CommandSender, command: Command, alias: String, args: Array<out String>): List<String> {
        return emptyList()
    }
}